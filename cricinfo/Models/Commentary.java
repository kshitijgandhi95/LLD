package cricinfo.Models;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Commentary {
    private SortedMap<Double, String> commentary;

    Commentary () {
        this.commentary = new TreeMap<>(new Comparator<Double>(){
            public int compare (Double d1, Double d2) {
                return (int)(d2-d1);
            }
        });
    }
}
