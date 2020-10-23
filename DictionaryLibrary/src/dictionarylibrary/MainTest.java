/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarylibrary;

/**
 *
 * @author Admin
 */
public class MainTest {
    public static void main(String[] args){
        DictionaryCommandLine Dic = new DictionaryCommandLine(); 
        String a="he";
        for(int i=0;i<Dic.Size();i++){
            String b=Dic.English().get(i);
            if(b.indexOf(a)>=0) System.out.println(Dic.English().get(i));
        }
        //Dic.ShowAllWords();
    }
}
