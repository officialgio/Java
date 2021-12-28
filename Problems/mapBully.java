/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
*/

// if your method doesn't have map already just include in on the body. Or in the Method.
public Map<String, String> mapBully(Map<String, String> map) {
  // Map<String, String> map = new HashMap
  if(map.containsKey("a")) {
    map.put("b", map.get("a"));
    map.put("a", "");
  }
  return map;
}
