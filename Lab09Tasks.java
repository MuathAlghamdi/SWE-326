class Question{
    private String text;
    
Question(){
    this(" ");
}
Question(String text){
    this.text = text;
}
public String getText(String text){
    return this.text;
}
public void setText(String text){
    this.text = text;
}
public String toString(){
    return "The Question is "+ this.text;
}
}
class MCQuestion extends Question{
    private String choiseA;
    private String choiseB;
    private String choiseC;
    private String choiseD;
MCQuestion(){
    this(" "," "," "," "," ");
}
MCQuestion(String text,String choiseA,String choiseB, String choiseC,String choiseD){
    super(text);
    this.choiseA = choiseA;
    this.choiseB = choiseB;
    this.choiseC = choiseC;
    this.choiseD = choiseD;
}
String getchoiseA(String choiseA){
    return this.choiseA;
}
void setchoiseA(String choiseA){
    this.choiseA = choiseA;
}
String getchoiseB(String choiseB){
    return this.choiseB;
}
void setchoiseB(String choiseB){
    this.choiseB = choiseB;
}
String getchoiseC(String choiseC){
    return this.choiseC;
}
void setchoiseC(String choiseC){
    this.choiseC = choiseC;
}
String getchoiseD(String choiseD){
    return this.choiseD;
}
void setchoiseD(String choiseD){
    this.choiseD = choiseD;
}
public String toString(){
    return super.toString()+"\n The first choise "+ choiseA +"\n The second choise "+ choiseB +"\n The third choise "+ choiseC +"\n The last choise "+ choiseD;
}
}

public class Lab09Tasks {
    public static void main(String[] args){
        Question q1 = new Question();
        MCQuestion c1 = new MCQuestion("What is your name? ","Muath","Ali","Saad","Saeed");
        System.out.println(c1);
    }
}
