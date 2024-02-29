class Cpu{
int price =70000;
class processor{
int core=8;
String manufacturer="intel";
void display(){
System.out.println("Core="+core);
System.out.println("Manufacturer="+manufacturer);
}
}
void display(){
System.out.println("Price="+price);
processor p=new processor();
p.display();
}
static class Ram{
int memory=8;
String manufacturer= "abc";
void display(){
System.out.println("Memory="+memory);
System.out.println("Manufacturer="+manufacturer);
}
}
}
class Cpus{
public static void main(String[] args){
Cpu c1=new Cpu();
c1.display();
Cpu.Ram c2=new Cpu.Ram();
c2.display();
}
}



