package controller16.changeController;

import javax.validation.constraints.Size;

public class ChangePwdCommand {

  @Size(min = 3)
  private String currentPassword;
  @Size(min = 3)
  private String newPassword;

  public String getCurrentPassword() {
    return currentPassword;
  }

  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }
}
