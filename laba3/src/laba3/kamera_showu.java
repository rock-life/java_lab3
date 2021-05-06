 package laba3;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class kamera_showu implements Serializable {
	
private String surname;
private LocalDate date;
private int termin;
private int in_nom;
private String predmet;
public kamera_showu() 
{ 
	surname=new String("none");
	termin=0;
	in_nom=0;
	predmet=new String("none");
}
public kamera_showu(String surname, LocalDate date, int termin,
int in_nom, String predmet) 
{
	this.surname=new String(surname);
	this.date=date;
	this.termin=termin;
	this.in_nom=in_nom;
	this.predmet=new String(surname);
}
public static Map<Integer,kamera_showu>kamera=new HashMap<Integer,kamera_showu>();	
private static void save()
{
	try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\file2.txt")))
	{
		oos.writeObject(kamera);
	}
	catch(Exception e) {System.out.println(e.getMessage());}
}

public static void search()
{
Scanner in= new Scanner(System.in);
System.out.print("���� ����� - ");
int day=in.nextInt();
System.out.print("����� ����� - ");
int m=in.nextInt();
System.out.print("�� ����� - ");
int y=in.nextInt();
boolean i=true;
	for(Map.Entry<Integer ,kamera_showu> entry: kamera.entrySet()) {
		  int key = entry.getKey();
		  kamera_showu value = entry.getValue();
		  if(value.date.getDayOfMonth()==day)
		  {
			  if(value.date.getMonthValue()==m)
				  if(value.date.getYear()==y) {
			  System.out.println("����������� ����� - "+value.in_nom+" ������� - "+value.surname);
				i=false;  }
			  }
		}
	if(i==true)
		System.out.print("���� �� ��������");
}
public static void start()
{
	 try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\file2.txt"))) 
	 {
		 kamera=(HashMap<Integer,kamera_showu>)ois.readObject();
	 }
	 catch(Exception e) {System.out.print(e.getMessage());}
	 }
public static void show()
{
	for(Map.Entry<Integer ,kamera_showu> entry: kamera.entrySet()) {
		  int key = entry.getKey();
		  kamera_showu value = entry.getValue();
		System.out.println("\n����������� ����� -"+value.in_nom+"\n������� - "+value.surname+"\n���� ����� - "+value.date.getDayOfMonth()+":"+value.date.getMonthValue()+":"+value.date.getYear()+"\n����� ��������� - "
				+value.termin+" ���\n����� �������� - "+value.predmet);
		}
}

public static void delete()
{
Scanner in= new Scanner(System.in);
System.out.print("������ ����������� ����� - ");
int i=in.nextInt();
kamera.remove(i);
save();
}

public static void add()
{
	String sur="", nam="";
	int day, mou, year, ter, inv,act=1;
	
	Scanner in=new Scanner(System.in);
	System.out.print("����������� ����� - ");
	inv=in.nextInt();
	for(Map.Entry<Integer ,kamera_showu> entry: kamera.entrySet()) {
		  int key = entry.getKey();
		  kamera_showu value = entry.getValue();
		  if(key==inv)
		  {
			  System.out.println("����������� ����� ����. ����������?\n -"+"������� - "+value.surname);
			  act=in.nextInt();
		  }
		  }
	if(act==1) 
	{
	System.out.print("������� - ");
	sur=in.next();
	System.out.print("���� ����� - ");
	day=in.nextInt();
	System.out.print("����� - ");
	mou=in.nextInt();
	System.out.print("�� - ");
	year=in.nextInt();
	LocalDate dat= LocalDate.of(year,mou,day);
	System.out.print("����� - ");
	ter=in.nextInt();
	System.out.print("����� ������� - ");
	nam=in.next();
	kamera_showu km=new kamera_showu(sur, dat, ter,
			inv,nam);
kamera.put(km.in_nom, km);	
save();
};

}
}

