package laba3;
import java.util.*;
class mounth {
private int mount, days, temp,t=0;
private String []day;
private int []tem;
public String name="";
public void Zap_rand(int month)
{
	this.mount=month;
	switch(mount)
	{
	case 1: name="\nСічень"; days=31;day=new String[days+1]; tem=new int[days+1];
		for(int j=0;j<days;j++)
			{
			t=j+1;
			if(t<10)
			day[j]=("0"+t+":01	");
			else
				day[j]=(t+":01	");
			tem[j]=((int)(-5+Math.random()*-25));
		}break;
	case 2: name="Лютий";days=28;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":02	");
	else
		day[j]=(t+":02	");
	tem[j]=((int)(-1+Math.random()*-15));
}break;
	case 3: name="Березень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":03	");
	else
		day[j]=(t+":03	");
	tem[j]=((int)(Math.random()*15-3));
}break;
	case 4: name="Квітень"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":04	");
	else
		day[j]=(t+":04	");
	tem[j]=((int)(5+Math.random()*15));
}break;
	case 5: name="Травень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":05	");
	else
		day[j]=(t+":05	");
	tem[j]=((int)(12+Math.random()*13));
}break;
	case 6: name="Червень"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":06	");
	else
		day[j]=(t+":06	");
	tem[j]=((int)(15+Math.random()*15));
}break;
	case 7: name="Липень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":07	");
	else
		day[j]=(t+":07	");
	tem[j]=((int)(20+Math.random()*12));
}break;
	case 8: name="Серпень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":08	");
	else
		day[j]=(t+":08	");
	tem[j]=((int)(20+Math.random()*15));
}break;
	case 9: name="Вересень"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":09	");
	else
		day[j]=(t+":09	");
	tem[j]=((int)(15+Math.random()*14));
}break;
	case 10: name="Жовтень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":10	");
	else
		day[j]=(t+":10	");
	tem[j]=((int)(5+Math.random()*17));
}break;
	case 11: name="Листопад"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":11	");
	else
		day[j]=(t+":11	");
	tem[j]=((int)(Math.random()*15-5));
}break;
	case 12: name="Грудень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":12	");
	else
		day[j]=(t+":12	");
	tem[j]=((int)(-5+Math.random()*-25));
}break;
	}
	this.getprint(month);
	System.out.println("\nСередня температура за місяць - "+this.argTemp());
}
public void zap_klava(int month) 
{
	Scanner in=new Scanner(System.in);
	this.mount=month;
	switch(mount)
	{
	case 1: name="Січень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":01	");
	else
	day[j]=(t+":01	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 2: name="Лютий"; days=28;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":02	");
	else
	day[j]=(t+":02	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 3: name="Березень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":03	");
	else
	day[j]=(t+":03	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 4: name="Квітень"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":04	");
	else
	day[j]=(t+":04	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 5: name="Травень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":05	");
	else
	day[j]=(t+":05	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 6: name="Червень"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":06	");
	else
	day[j]=(t+":06	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 7: name="Липень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":07	");
	else
	day[j]=(t+":07	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 8: name="Серпень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":08	");
	else
	day[j]=(t+":08	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 9: name="Вересень"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":09	");
	else
	day[j]=(t+":09	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 10: name="Жовтень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":10	");
	else
	day[j]=(t+":10	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 11: name="Листопад"; days=30;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":11	");
	else
	day[j]=(t+":11	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	case 12: name="Грудень"; days=31;day=new String[days+1]; tem=new int[days+1];
	for(int j=0;j<days;j++)
	{
	t=j+1;
	if(t<10)
	day[j]=("0"+t+":12	");
	else
	day[j]=(t+":12	");
	System.out.print("Дата "+day[j]+". Температура - ");
	tem[j]=in.nextInt();
}break;
	}
}
public void getprint(int month)
{
this.mount=month;
switch(mount)
{
case 1: name="\nСічень";days=31;System.out.println(name);
	for(int j=0;j<days;j++)
		System.out.print(day[j]);
	System.out.println("");
	for(int j=0;j<days;j++)
		System.out.print(tem[j]+"	");break;
case 2: name="\nЛютий"; days=28;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");break;
case 3: name="\nБерезень"; days=31;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");break;
case 4: name="\nКвітень"; days=30;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 5: name="\nТравень"; days=31;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 6: name="\nЧервень"; days=30;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 7: name="\nЛипень"; days=31;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 8: name="\nСерпень"; days=31;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 9: name="\nВересень"; days=30;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 10: name="\nЖовтень"; days=31;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 11: name="\nЛистопад"; days=30;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
case 12: name="\nГрудень"; days=31;System.out.println(name);
for(int j=0;j<days;j++)
	System.out.print(day[j]);
System.out.println("");
for(int j=0;j<days;j++)
	System.out.print(tem[j]+"	");
			break;
}
}

public int argTemp() 
{t=0;
if(tem.length>1)
{
for(int i=0;i<days;i++)	
{
t=t+tem[i];
}
return t/days;
}
else
	return -1;
}

public static void toBig(mounth mas[])
{
	String n="";
	int b=0,temp=mas[0].argTemp();
	for(int i=0;i<12;i++)
	{
			if(temp<mas[i].argTemp())
				{
					temp=mas[i].argTemp();
					n=mas[i].name;
				}
	}
	System.out.print("Mісяць з найбільшою середньою температурою - "+ n+" - "+temp+"\n");
}
}
