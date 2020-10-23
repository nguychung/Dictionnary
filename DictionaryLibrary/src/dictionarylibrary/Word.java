
package dictionarylibrary;

import java.util.ArrayList;

public class Word {
    private ArrayList<String> word_target = new ArrayList();
    private ArrayList<String> word_explain = new ArrayList();
    public void Insert(String eng,String vn){
        word_target.add(eng);
        word_explain.add(vn);
    } 
    public ArrayList<String> getWord_target() {
        return word_target;
    }
     
    public ArrayList<String> getWord_explain() {
        return word_explain;
    }
    
    
    public Word(){
        word_target=new ArrayList();
        word_explain = new ArrayList();
    }
}
