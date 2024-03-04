package l35;

import java.util.Comparator;

public class RelativesCountComparator implements Comparator<Beaver> {

    @Override
    public int compare(Beaver o1, Beaver o2) {
        return Integer.compare(o1.getRelativesCount(), o2.getRelativesCount());
    }
}
