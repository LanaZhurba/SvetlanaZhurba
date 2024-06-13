package part5;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Phone_Directory {
    private HashMap<String, String> record;

    public Phone_Directory() {
        this.record = new HashMap<>();
    }

    public void add(String phone, String name) {
        record.put(phone, name);
    }

    public HashMap<String, String> get(String name) {
        HashMap<String, String> seachRecord = new HashMap<>();
        for (Map.Entry<String, String> o : record.entrySet()) {
            if (o.getValue().equalsIgnoreCase(name)) {
                seachRecord.put(o.getKey(), o.getValue());
            }
        }
        return seachRecord;
    }
}
