/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList <String>> map;
    
    public DictionaryOfManyTranslations(){
        this.map = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if(map.containsKey(word)){
            map.get(word).add(translation);
            return;
        }
        map.put(word, new ArrayList<>());
        map.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(map.containsKey(word)){
            return map.get(word);
        }
        ArrayList<String> list = new ArrayList<>();
        return list;
    }
    
    public void remove(String word){
        map.remove(word, map.get(word));
    }
    
}
