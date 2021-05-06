
package laba3;
import java.util.*;
public class laba3 {
public static void main(String[] str) 
{
	
	Scanner in=null;
	int v=10;
	while(v!=0) {
		try {
	in=new Scanner(System.in);
	System.out.print("Виберіть завдання:\n1 - Описати клас для бази зданих з інформацією про метеорологічні спостереження протягом \r\n"
			+ "року у форматі: дата (ДД:ММ), температура повітря. Знайти середню температуру повітря кожного місяця \r\n"
			+ "та вивести на екран таблицю: місяць, середня температура. Визначити назву місяця з найбільшою \r\n"
			+ "середньою температурою повітря..\n2 класи ти файли \n0 - Вихід");
	v=in.nextInt();
	switch(v) {
	case 1:one();break;
	case 2:two();break;
	case 3:break;}
		}
		catch(Exception ex) {System.out.print("Невірний формат данних!");};
	}
	
}

public static void one()
{
	mounth mas[]=new mounth[12];
	mounth januar=new mounth();
	mas[0]=januar;
	mounth februar=new mounth();
	mas[1]=februar;
	mounth mart=new mounth();
	mas[2]=mart;
	mounth april=new mounth();
	mas[3]=april;
	mounth may=new mounth();
	mas[4]=may;
	mounth june=new mounth();
	mas[5]=june;
	mounth jule=new mounth();
	mas[6]=jule;
	mounth august=new mounth();
	mas[7]=august;
	mounth oktober=new mounth();
	mas[8]=oktober;
	mounth september=new mounth();
	mas[9]=september;
	mounth november=new mounth();
	mas[10]=november;
	mounth dezember=new mounth();
	mas[11]=dezember;
	Scanner in2=new Scanner(System.in);
	int v1=10;
	while(v1!=0) {
	System.out.print("1 - Заповнити рандомно \n2 - Заповнити з клавіатури\n0-exit");
	v1=in2.nextInt();
	switch(v1)
	{
	case 1: januar.Zap_rand(1);	februar.Zap_rand(2);mart.Zap_rand(3);april.Zap_rand(4);	may.Zap_rand(5);june.Zap_rand(6);jule.Zap_rand(7);august.Zap_rand(8);	oktober.Zap_rand(9);september.Zap_rand(10);	november.Zap_rand(11);	dezember.Zap_rand(12); 
mounth.toBig(mas);break;
	case 2:januar.zap_klava(1);;	februar.zap_klava(2);mart.zap_klava(3);april.zap_klava(4);	may.zap_klava(5);june.zap_klava(6);jule.zap_klava(7);august.zap_klava(8);	oktober.zap_klava(9);september.zap_klava(10);	november.zap_klava(11);	dezember.zap_klava(12); 
	mounth.toBig(mas);break;
	case 0: break;
	}
	}
}

public static void two()
{
	kamera_showu.start();
	kamera_showu km;
	Scanner in=null;
	String v="";
	while(v!="exit") {
		try {
	in=new Scanner(System.in);
	System.out.print("Виберіть завдання:\none - додати/редагувати two - вивести tree - видалити four - пошук");
	v=in.nextLine();
	switch(v) {
	case "one":kamera_showu.add(); ;break;
	case "two":kamera_showu.show(); ;break;
	case "tree":kamera_showu.delete(); break;
	case "four":kamera_showu.search();break;
	default: System.out.print("Error value");
	}
		}
		catch(Exception ex) {System.out.print("Невірний формат данних!");};
	}
};

}
