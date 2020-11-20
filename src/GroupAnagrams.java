import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String [] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(input));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,Integer> hashMap = new HashMap<>();//sorted String as key, index in list as value（答案用的 String：List快很多）
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s = String.valueOf(chars);//新學的 也可以是 new String（chars）
            if(hashMap.containsKey(s)){
                result.get(hashMap.get(s)).add(strs[i]);
            }else {
                List<String> stringList = new ArrayList<>();
                stringList.add(strs[i]);
                result.add(stringList);
                hashMap.put(s,result.indexOf(stringList));
            }
        }
        return result;//如果用的<String,List> 最後 return new Arraylist（hashmap.values（））直接把hashmap 轉成list
    }

//    private static boolean equals(List<List<String>> lists,String s){
//        if(lists.equals(null)){
//            return false;
//        }
//
//        for (int i = 0; i < lists.size(); i++) {
//           char [] chars = lists.get(i).get(0).toCharArray();
//           c
//        }
//        s.
//        return false;
//    }
//
//    private static int index(List<List<String>> lists,String s){
//
//        return -1;
//    }
}
