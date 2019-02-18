package tdd.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NameInverter {

    private String name;

    private String formatMultiElementName(List<String> names) {
        String postNominal = "";
        if (names.size() > 2)
            postNominal = getPostNominal(names);
        return String.format("%s, %s %s", names.get(1), names.get(0), postNominal).trim();
    }

    private boolean isHonorific(List<String> names) {
        return names.get(0).matches("Mr\\.|Mrs\\.");
    }

    private String getPostNominal(List<String> names) {
        List<String> postNominals = names.subList(2, names.size());
        return String.join(" ", postNominals);
    }

    public String invert(String name) {
        this.name = name;
        if (this.name == null || this.name.isEmpty())
            return "";
        else
            return formatName(removeHonorific(splitNames(this.name)));
    }

    private String formatName(List<String> names) {
        if (names.size() == 1)
            return names.get(0);
        return formatMultiElementName(names);
    }

    private List<String> removeHonorific(List<String> names) {
        if (names.size() > 1 && isHonorific(names))
            names.remove(0);
        return names;
    }

    private ArrayList<String> splitNames(String name) {
        return new ArrayList<>(Arrays.asList(name.trim().split("\\s+")));
    }
}
