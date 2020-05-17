


import javafx.util.Pair;

import java.util.*;

//转换为一个广度优先搜索的案例。
//每一层是都是上一层的基础上改变一个字母。
//这颗树动态的，不同beginword生成的树不一样。
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Map<String, List<String>> allComboDict = new HashMap<>();
        int length = beginWord.length();
        wordList.forEach(
                word ->{
                    for(int i=0;i<length;i++){
                        String newWord = word.substring(0,i) +"*"+word.substring(i+1,length);
                        List<String> wl = allComboDict.getOrDefault(newWord,new ArrayList<>());
                        wl.add(word);
                        allComboDict.put(newWord,wl) ;
                    }
                }
        );
        LinkedList<Pair<String,Integer>> queue = new LinkedList<Pair<String,Integer>>();
        Map<String, Boolean> visited = new HashMap<>();

        queue.add(new Pair<>(beginWord,1));
        while(queue.size()!=0){
            Pair<String,Integer> word = queue.remove();
            for(int i=0;i<length;i++){
                String newWord = word.getKey().substring(0,i) +"*"+word.getKey().substring(i+1,length);
                if(allComboDict.containsKey(newWord)){
                    for(String w:allComboDict.get(newWord)){
                        if(endWord.equals(w)){
                            return word.getValue()+1;
                        }
                        if(!visited.getOrDefault(w,false)){
                            visited.put(w,true);
                            queue.add(new Pair<>(w,word.getValue()+1));
                        }
                    }
                }
            }
        }
        return 0;
    }

}
