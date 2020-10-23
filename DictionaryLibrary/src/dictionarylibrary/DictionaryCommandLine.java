
package dictionarylibrary;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;


public class DictionaryCommandLine{
    private Word data = new Word();
    //In ra danh sach tu dien
    DictionaryCommandLine(){
        this.InsertFromFile();
    }
    public void ShowAllWords(){
        for(int i=0;i<data.getWord_target().size();i++){   
        System.out.println(data.getWord_target().get(i)+"   "+data.getWord_explain().get(i));
        }
    }
    //Nhap va in ra danh sach tu dien
    public void Basic(int i){
        Scanner sc = new Scanner(System.in);
        while(i>0){
            data.Insert(sc.nextLine(),sc.nextLine());
            i--;
        }
        ShowAllWords();
        }
    //Nhap tu dien tu file
    public void InsertFromFile(){
    try{
        File text = new File("C:\\BaiTapTuanJava\\DICTIONARY11\\Anh-Viet.txt");
        Scanner sc=new Scanner(text);
        while(sc.hasNextLine()){
            String word = sc.nextLine();
            int vitridautab = word.indexOf("\t");
            if(word.length()>0 && vitridautab>0)
            {
                String english = word.substring(0, vitridautab);
                String vnu = word.substring(vitridautab+1, word.length());
                data.Insert(english,vnu);
            }
        }
        
        sc.close();
    }
    catch(FileNotFoundException e) {
	    System.out.println("Error");
	}
}
    //Tim tu va tra ve nghia
    public String LookUp(String eng){
        for(int i=0;i<data.getWord_target().size();i++){
            if(eng.equals(data.getWord_target().get(i))){
                return data.getWord_explain().get(i);
            }
        }
        return "Khong tim thay";
    }
    //Tim tu va tra ve vi tri tu day
    public int DictionarySearcher(String eng){
        return data.getWord_target().indexOf(eng);
    }
    //Them tu vao danh sach
    public void Add(String eng,String vn){
       data.Insert(eng, vn);
       PrintFile();
    }
    //Xoa tu khoi danh sach
    public void Del(String eng){
        int n=DictionarySearcher(eng);
        if(n<0) System.out.println("khong tim thay");
        else{
        data.getWord_target().remove(n);
        data.getWord_explain().remove(n);
        PrintFile();}
    }
    //Sua nghia cua tu trong danh sach
    public void EditFrom(String eng,String vn){
        int n=DictionarySearcher(eng);
        if(n<0) System.out.println("khong tim thay");
        else{
            data.getWord_explain().set(n, vn);
        }
        PrintFile();
    }
    //Ghi vao file
    public void PrintFile(){
        try {
            File fileDir = new File("C:\\BaiTapTuanJava\\DICTIONARY11\\Anh-Viet.txt");
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileDir), "UTF8"));
            for(int i=0;i<data.getWord_target().size();i++){
                out.append(data.getWord_target().get(i)).append("\t").append(data.getWord_explain().get(i)).append("\r\n");
            }
            out.flush();
            out.close(); 
	} catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
	} catch (IOException e) {
            System.out.println(e.getMessage());
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
    }
    //tra ve tu tieng anh theo vi tri
    public String LookUp1(int i){
        return data.getWord_target().get(i);
    }
    //tra ve kich thuoc
    public int Size(){
        return data.getWord_target().size();
    }
    //tra ve chuoi tieng anh
    public ArrayList<String> English(){
        return data.getWord_target();
    }
}