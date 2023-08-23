import java.util.HashMap;
import java.util.Map;

public class StudentsMap {
  public static Map<String, String> getStudentsMap() {

    Map map = new HashMap();

    map.put("taro", "太郎");
    map.put("kota", "康太");
    map.put("takuto", "拓斗");

    return map;
  }
}