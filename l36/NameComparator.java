package l36;

import java.util.Comparator;

public class NameComparator implements Comparator<Beaver>{
    @Override
    public int compare(Beaver o1, Beaver o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
