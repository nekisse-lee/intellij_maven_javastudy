package main;

import config.AppCtx2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static AnnotationConfigApplicationContext ctx = null;

    public static void main(String[] args) throws IOException {

        ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("명령어 입력");
            String command = reader.readLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("종료합니다.");
                break;
            }
            if (command.startsWith("new ")) {
                processNewCommand(command.split(" "));
            } else if (command.startsWith("change ")) {
                processChangeCommand(command.split(" "));
            } else if (command.equals("list")) {
                processListCommand();
            } else if (command.startsWith("info ")) {
                processInfoCommand(command.split(" "));
            } else {
                printHelp();
            }
        }

    }

    private static void processInfoCommand(String[] args) {
        MemberInfoPrinter infoPrinter = ctx.getBean(MemberInfoPrinter.class);
        infoPrinter.printMemberInfo(args[1]);

    }

    private static void processListCommand() {
        MemberListPrinter listPrinter = ctx.getBean(MemberListPrinter.class);
        listPrinter.printAll();

    }

    private static void processChangeCommand(String[] args) {
        if (args.length != 4) {
            printHelp();
            return;
        }
        ChangePasswordService changePwdSvc = ctx.getBean(ChangePasswordService.class);
        try {
            changePwdSvc.changePassword(args[1], args[2], args[3]);
            System.out.println("암호를 변경했습니다.\n");
        } catch (MemberNotFoundException e) {
            System.out.println("존재하지 않는 이메일 입니다.\n");
        } catch (WrongIdPasswordException e) {
            System.out.println("이메일과 암호가 일치하지 않습니다. \n");
        }

    }

    private static void processNewCommand(String[] args) {
        if (args.length != 5) {
            printHelp();
            return;
        }
        MemberRegisterService regSvc = ctx.getBean(MemberRegisterService.class);
        RegisterRequest req = new RegisterRequest();
        req.setEmail(args[1]);
        req.setName(args[2]);
        req.setPassword(args[3]);
        req.setConfirmPassword(args[4]);

        if (!req.isPasswordEqualToConfirmPassword()) {
            System.out.println("암호와 확인이 일치하지 않습니다. \n");
            return;
        }

        try {
            regSvc.regist(req);
            System.out.println("등록완료");
        } catch (DuplicateMemberException e) {
            System.out.println("이미 존재하는 이메일 입니다.");
        }
    }




    private static void printHelp() {
        System.out.println();
        System.out.println("잘못된 명령입니다. 아래 명령어 사용법을 확인하세요.");
        System.out.println("명령어 사용법:");
        System.out.println("new 이메일 이름 암호 암호확인");
        System.out.println("change 이메일 현재비번 변경비번");
        System.out.println("info 이메일");

        System.out.println();
    }



}
