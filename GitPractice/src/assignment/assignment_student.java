package assignment;
import java.util.*;
public class assignment_student
{
	public static void main(String[] args)
	{

		List <Student>c1=new ArrayList<Student>();

		Student c1s1=new Student();
		c1s1.rollno=1;
		c1s1.name="Prasad";
		c1s1.marks=45;
		c1.add(c1s1);

		Student c1s2=new Student();
		c1s2.rollno=2;
		c1s2.name="Tirupathi";
		c1s2.marks=55;
		c1.add(c1s2);

		Student c1s3=new Student();
		c1s3.rollno=3;
		c1s3.name="Bharath";
		c1s3.marks=38;
		c1.add(c1s3);

		Student c1s4=new Student();
		c1s4.rollno=4;
		c1s4.name="Sindhu";
		c1s4.marks=68;
		c1.add(c1s4);

		Student c1s5=new Student();
		c1s5.rollno=5;
		c1s5.name="Dharma";
		c1s5.marks=66;
		c1.add(c1s5);



		List <Student>c2=new ArrayList<Student>();
		Student c2s1=new Student();
		c2s1.rollno=1;
		c2s1.name="Renuka";
		c2s1.marks=72;
		c2.add(c2s1);

		Student c2s2=new Student();
		c2s2.rollno=2;
		c2s2.name="Anil";
		c2s2.marks=56;
		c2.add(c2s2);

		Student c2s3=new Student();
		c2s3.rollno=3;
		c2s3.name="Swathi";
		c2s3.marks=58;
		c2.add(c2s3);

		Student c2s4=new Student();
		c2s4.rollno=4;
		c2s4.name="Srivani";
		c2s4.marks=74;
		c2.add(c2s4);

		Student c2s5=new Student();
		c2s5.rollno=5;
		c2s5.name="Sarika";
		c2s5.marks=37;
		c2.add(c2s5);

		List <Student>c3=new ArrayList<Student>();
		Student c3s1=new Student();
		c3s1.rollno=1;
		c3s1.name="Preethi";
		c3s1.marks=66;
		c3.add(c3s1);

		Student c3s2=new Student();
		c3s2.rollno=2;
		c3s2.name="Nabee";
		c3s2.marks=89;
		c3.add(c3s2);

		Student c3s3=new Student();
		c3s3.rollno=3;
		c3s3.name="Kavi";
		c3s3.marks=40;
		c3.add(c3s3);

		Student c3s4=new Student();
		c3s4.rollno=4;
		c3s4.name="Satya";
		c3s4.marks=77;
		c3.add(c3s4);

		Student c3s5=new Student();
		c3s5.rollno=5;
		c3s5.name="Sushanth";
		c3s5.marks=39;
		c3.add(c3s5);

		Map <Integer,List<Student>>SriChaitanya=new HashMap<>();
		SriChaitanya.put(1, c1);
		SriChaitanya.put(2, c2);
		SriChaitanya.put(3, c3);



		//-------------------------------------------------------------------------------------

		List<Student >oc1=new ArrayList<Student>();
		Student oc1s1=new Student();
		oc1s1.rollno=1;
		oc1s1.name="Vaibhav";
		oc1s1.marks=27;
		oc1.add(oc1s1);

		Student oc1s2=new Student();
		oc1s2.rollno=2;
		oc1s2.name="Deekshanth";
		oc1s2.marks=75;
		oc1.add(oc1s2);

		Student oc1s3=new Student();
		oc1s3.rollno=3;
		oc1s3.name="Mounika";
		oc1s3.marks=39;
		oc1.add(oc1s3);

		Student oc1s4=new Student();
		oc1s4.rollno=4;
		oc1s4.name="Duher";
		oc1s4.marks=68;
		c1.add(oc1s4);

		Student oc1s5=new Student();
		oc1s5.rollno=5;
		oc1s5.name="Qadir";
		oc1s5.marks=88;
		c1.add(oc1s5);

		List <Student>oc2=new ArrayList<Student>();
		Student oc2s1=new Student();
		oc2s1.rollno=1;
		oc2s1.name="Zohaib";
		oc2s1.marks=79;
		oc2.add(oc2s1);

		Student oc2s2=new Student();
		oc2s2.rollno=2;
		oc2s2.name="Chetan";
		oc2s2.marks=51;
		oc2.add(oc2s2);

		Student oc2s3=new Student();
		oc2s3.rollno=3;
		oc2s3.name="Mahesh";
		oc2s3.marks=48;
		oc2.add(oc2s3);

		Student oc2s4=new Student();
		oc2s4.rollno=4;
		oc2s4.name="Asif";
		oc2s4.marks=94;
		oc2.add(oc2s4);

		Student oc2s5=new Student();
		oc2s5.rollno=5;
		oc2s5.name="Prem";
		oc2s5.marks=47;
		oc2.add(oc2s5);

		List <Student>oc3=new ArrayList<Student>();
		Student oc3s1=new Student();
		oc3s1.rollno=1;
		oc3s1.name="Sai";
		oc3s1.marks=21;
		oc3.add(oc3s1);

		Student oc3s2=new Student();
		oc3s2.rollno=2;
		oc3s2.name="Sajid";
		oc3s2.marks=91;
		oc3.add(oc3s2);

		Student oc3s3=new Student();
		oc3s3.rollno=3;
		oc3s3.name="Praveen";
		oc3s3.marks=43;
		oc3.add(oc3s3);

		Student oc3s4=new Student();
		oc3s4.rollno=4;
		oc3s4.name="Hari";
		oc3s4.marks=77;
		oc3.add(oc3s4);

		Student oc3s5=new Student();
		oc3s5.rollno=5;
		oc3s5.name="Akhila";
		oc3s5.marks=97;
		oc3.add(oc3s5);

		Map <Integer,List<Student>>Narayana=new HashMap<>();
		Narayana.put(1, c1);
		Narayana.put(2, oc2);
		Narayana.put(3, oc3);

		//------------------------------------------------------------------------------   

		List <Student>ooc1=new ArrayList<Student>();
		Student ooc1s1=new Student();
		ooc1s1.rollno=1;
		ooc1s1.name="Nagul";
		ooc1s1.marks=33;
		ooc1.add(ooc1s1);

		Student ooc1s2=new Student();
		ooc1s2.rollno=2;
		ooc1s2.name="Jaanu";
		ooc1s2.marks=96;
		ooc1.add(ooc1s2);

		Student ooc1s3=new Student();
		ooc1s3.rollno=3;
		ooc1s3.name="Mouni";
		ooc1s3.marks=27;
		ooc1.add(ooc1s3);

		Student ooc1s4=new Student();
		ooc1s4.rollno=4;
		ooc1s4.name="Pavan";
		ooc1s4.marks=66;
		ooc1.add(ooc1s4);

		Student ooc1s5=new Student();
		ooc1s5.rollno=5;
		ooc1s5.name="Eeshwar";
		ooc1s5.marks=77;
		ooc1.add(ooc1s5);

		List <Student>ooc2=new ArrayList<Student>();
		Student ooc2s1=new Student();
		ooc2s1.rollno=1;
		ooc2s1.name="ooc2s1";
		ooc2s1.marks=59;
		ooc2.add(ooc2s1);

		Student ooc2s2=new Student();
		ooc2s2.rollno=2;
		ooc2s2.name="Salma";
		ooc2s2.marks=85;
		ooc2.add(ooc2s2);

		Student ooc2s3=new Student();
		ooc2s3.rollno=3;
		ooc2s3.name="Bhupathi";
		ooc2s3.marks=75;
		ooc2.add(ooc2s3);

		Student ooc2s4=new Student();
		ooc2s4.rollno=4;
		ooc2s4.name="Harshita";
		ooc2s4.marks=11;
		ooc2.add(ooc2s4);

		Student ooc2s5=new Student();
		ooc2s5.rollno=5;
		ooc2s5.name="Abdul";
		ooc2s5.marks=31;
		ooc2.add(ooc2s5);

		List <Student>ooc3=new ArrayList<Student>();
		Student ooc3s1=new Student();
		ooc3s1.rollno=1;
		ooc3s1.name="Srilekha";
		ooc3s1.marks=57;
		ooc3.add(ooc3s1);

		Student ooc3s2=new Student();
		ooc3s2.rollno=2;
		ooc3s2.name="Nafeez";
		ooc3s2.marks=53;
		ooc3.add(ooc3s2);

		Student ooc3s3=new Student();
		ooc3s3.rollno=3;
		ooc3s3.name="Khasim";
		ooc3s3.marks=49;
		ooc3.add(ooc3s3);

		Student ooc3s4=new Student();
		ooc3s4.rollno=4;
		ooc3s4.name="";
		ooc3s4.marks=77;
		ooc3.add(ooc3s4);

		Student ooc3s5=new Student();
		ooc3s5.rollno=5;
		ooc3s5.name="ooc3s5";
		ooc3s5.marks=22;
		ooc3.add(ooc3s5);




		Map <Integer,List<Student>>Bhashyam=new HashMap<>();
		Bhashyam.put(1, ooc1);
		Bhashyam.put(2, ooc2);
		Bhashyam.put(3, ooc3);

		//------------------------------------------------------------------------------
		Map <String,Map<Integer,List<Student>>> AP=new HashMap<>();
		AP.put("SriChaitanya School", SriChaitanya);
		AP.put("Narayana School", Narayana);
		AP.put("Bhashyam School", Bhashyam);




		//================================================================================



		List <Student>c01=new ArrayList<Student>();
		Student c01s1=new Student();
		c01s1.rollno=1;
		c01s1.name="c01s1";
		c01s1.marks=74;
		c01.add(c01s1);



		Student c01s2=new Student();
		c01s2.rollno=2;
		c01s2.name="c01s2";
		c01s2.marks=47;
		c01.add(c01s2);


		Student c01s3=new Student();
		c01s3.rollno=3;
		c01s3.name="c01s3";
		c01s3.marks=83;
		c01.add(c01s3);


		Student c01s4=new Student();
		c01s4.rollno=4;
		c01s4.name="c01s4";
		c01s4.marks=26;
		c01.add(c01s4);


		Student c01s5=new Student();
		c01s5.rollno=5;
		c01s5.name="c01s5";
		c01s5.marks=66;
		c01.add(c01s5);


		List <Student>c02=new ArrayList<Student>();
		Student c02s1=new Student();
		c02s1.rollno=1;
		c02s1.name="c02s1";
		c02s1.marks=50;
		c02.add(c02s1);


		Student c02s2=new Student();
		c02s2.rollno=2;
		c02s2.name="c2s2";
		c02s2.marks=65;
		c02.add(c02s2);


		Student c02s3=new Student();
		c02s3.rollno=3;
		c02s3.name="c2s3";
		c02s3.marks=60;
		c02.add(c02s3);


		Student c02s4=new Student();
		c02s4.rollno=4;
		c02s4.name="c02s4";
		c02s4.marks=70;
		c02.add(c02s4);


		Student c02s5=new Student();
		c02s5.rollno=5;
		c02s5.name="c02s5";
		c02s5.marks=73;
		c02.add(c02s5);


		List <Student>c03=new ArrayList<Student>();
		Student c03s1=new Student();
		c03s1.rollno=1;
		c03s1.name="c03s1";
		c03s1.marks=66;
		c03.add(c03s1);


		Student c03s2=new Student();
		c03s2.rollno=2;
		c03s2.name="c03s2";
		c03s2.marks=98;
		c03.add(c03s2);


		Student c03s3=new Student();
		c03s3.rollno=3;
		c03s3.name="c03s3";
		c03s3.marks=70;
		c03.add(c03s3);


		Student c03s4=new Student();
		c03s4.rollno=4;
		c03s4.name="c03s4";
		c03s4.marks=80;
		c03.add(c03s4);


		Student c03s5=new Student();
		c03s5.rollno=5;
		c03s5.name="c03s5";
		c03s5.marks=93;
		c03.add(c03s5);





		Map <Integer,List<Student>>HyderabadPublicSchool=new HashMap<>();
		HyderabadPublicSchool.put(1, c01);
		HyderabadPublicSchool.put(2, c02);
		HyderabadPublicSchool.put(3, c03);

		//-------------------------------------------------------------------------------------

		List <Student>oc01=new ArrayList<Student>();
		Student oc01s1=new Student();
		oc01s1.rollno=1;
		oc01s1.name="oc01s1";
		oc01s1.marks=72;
		oc01.add(oc01s1);

		Student oc01s2=new Student();
		oc01s2.rollno=2;
		oc01s2.name="oc01s2";
		oc01s2.marks=57;
		oc01.add(oc01s2);

		Student oc01s3=new Student();
		oc01s3.rollno=3;
		oc01s3.name="oc01s3";
		oc01s3.marks=90;
		oc01.add(oc01s3);

		Student oc01s4=new Student();
		oc01s4.rollno=4;
		oc01s4.name="oc01s4";
		oc01s4.marks=86;
		oc01.add(oc01s4);

		Student oc01s5=new Student();
		oc01s5.rollno=5;
		oc01s5.name="oc01s5";
		oc01s5.marks=94;
		oc01.add(oc01s5);

		List <Student>oc02=new ArrayList<Student>();
		Student oc02s1=new Student();
		oc02s1.rollno=1;
		oc02s1.name="oc02s1";
		oc02s1.marks=71;
		oc02.add(oc02s1);

		Student oc02s2=new Student();
		oc02s2.rollno=2;
		oc02s2.name="oc02s2";
		oc02s2.marks=15;
		oc02.add(oc02s2);

		Student oc02s3=new Student();
		oc02s3.rollno=3;
		oc02s3.name="oc02s3";
		oc02s3.marks=84;
		oc02.add(oc02s3);

		Student oc02s4=new Student();
		oc02s4.rollno=4;
		oc02s4.name="oc02s4";
		oc02s4.marks=49;
		oc02.add(oc02s4);

		Student oc02s5=new Student();
		oc02s5.rollno=5;
		oc02s5.name="oc02s5";
		oc02s5.marks=74;
		oc02.add(oc02s5);

		List <Student>oc03=new ArrayList<Student>();
		Student oc03s1=new Student();
		oc03s1.rollno=1;
		oc03s1.name="oc03s1";
		oc03s1.marks=12;
		oc03.add(oc03s1);

		Student oc03s2=new Student();
		oc03s2.rollno=2;
		oc03s2.name="oc03s2";
		oc03s2.marks=19;
		oc03.add(oc03s2);

		Student oc03s3=new Student();
		oc03s3.rollno=3;
		oc03s3.name="oc3s3";
		oc03s3.marks=43;
		oc03.add(oc03s3);

		Student oc03s4=new Student();
		oc03s4.rollno=4;
		oc03s4.name="oc03s4";
		oc03s4.marks=77;
		oc03.add(oc03s4);

		Student oc03s5=new Student();
		oc03s5.rollno=5;
		oc03s5.name="oc03s5";
		oc03s5.marks=90;
		oc03.add(oc03s5);

		Map <Integer,List<Student>>MeridianSchool=new HashMap<>();
		MeridianSchool.put(1, oc01);
		MeridianSchool.put(2, oc02);
		MeridianSchool.put(3, oc03);
		//------------------------------------------------------------------------------   
		List <Student>ooc01=new ArrayList<Student>();
		Student ooc01s1=new Student();
		ooc01s1.rollno=1;
		ooc01s1.name="ooc01s1";
		ooc01s1.marks=35;
		ooc01.add(ooc01s1);

		Student ooc01s2=new Student();
		ooc01s2.rollno=2;
		ooc01s2.name="ooc01s2";
		ooc01s2.marks=69;
		ooc01.add(ooc01s2);

		Student ooc01s3=new Student();
		ooc01s3.rollno=3;
		ooc01s3.name="ooc01s3";
		ooc01s3.marks=72;
		ooc01.add(ooc01s3);

		Student ooc01s4=new Student();
		ooc01s4.rollno=4;
		ooc01s4.name="ooc01s4";
		ooc01s4.marks=78;
		ooc01.add(ooc01s4);

		Student ooc01s5=new Student();
		ooc01s5.rollno=5;
		ooc01s5.name="ooc01s5";
		ooc01s5.marks=13;
		ooc01.add(ooc01s5);

		List <Student>ooc02=new ArrayList<Student>();
		Student ooc02s1=new Student();
		ooc02s1.rollno=1;
		ooc02s1.name="ooc02s1";
		ooc02s1.marks=95;
		ooc02.add(ooc02s1);

		Student ooc02s2=new Student();
		ooc02s2.rollno=2;
		ooc02s2.name="ooc02s2";
		ooc02s2.marks=16;
		ooc02.add(ooc02s2);

		Student ooc02s3=new Student();
		ooc02s3.rollno=3;
		ooc02s3.name="ooc02s3";
		ooc02s3.marks=57;
		ooc02.add(ooc02s3);

		Student ooc02s4=new Student();
		ooc02s4.rollno=4;
		ooc02s4.name="ooc02s4";
		ooc02s4.marks=62;
		ooc02.add(ooc02s4);

		Student ooc02s5=new Student();
		ooc02s5.rollno=5;
		ooc02s5.name="ooc02s5";
		ooc02s5.marks=55;
		ooc02.add(ooc02s5);

		List <Student>ooc03=new ArrayList<Student>();
		Student ooc03s1=new Student();
		ooc03s1.rollno=1;
		ooc03s1.name="ooc03s1";
		ooc03s1.marks=62;
		ooc03.add(ooc03s1);

		Student ooc03s2=new Student();
		ooc03s2.rollno=2;
		ooc03s2.name="ooc03s2";
		ooc03s2.marks=33;
		ooc03.add(ooc03s2);

		Student ooc03s3=new Student();
		ooc03s3.rollno=3;
		ooc03s3.name="ooc03s3";
		ooc03s3.marks=49;
		ooc03.add(ooc03s3);

		Student ooc03s4=new Student();
		ooc03s4.rollno=4;
		ooc03s4.name="ooc03s4";
		ooc03s4.marks=10;
		ooc03.add(ooc03s4);

		Student ooc03s5=new Student();
		ooc03s5.rollno=5;
		ooc03s5.name="ooc3s5";
		ooc03s5.marks=0;
		ooc03.add(ooc03s5);


		Map <Integer,List<Student>>StAnnsHighSchool=new HashMap<>();
		StAnnsHighSchool.put(1, ooc01);
		StAnnsHighSchool.put(2, ooc02);
		StAnnsHighSchool.put(3, ooc03);


		//------------------------------------------------------------------------------
		Map <String,Map<Integer,List<Student>>> TS=new HashMap<>();
		TS.put("HPS", HyderabadPublicSchool);
		TS.put("Meridian", MeridianSchool);
		TS.put("StAnns", StAnnsHighSchool);

		Map<String,Map <String,Map<Integer,List<Student>>>> total=new HashMap<>();
		total.put("ANDHRA PRADESH", AP);
		total.put("TELANGANA", TS);




		for(String u:total.keySet())
		{
			Map<String, Map<Integer, List<Student>>> state=total.get(u);
			System.out.println("==============================================================================================");
			System.out.println("Students of State------------------------------ "+u);
			//if(state==AP)   //Display students by State
			for(String m:state.keySet())
			{
				Map<Integer, List<Student>> school=state.get(m);

				System.out.println("Students of School------------------------------ "+m);
				if(school==Narayana)  //Display students by School
				{
					for(int v:school.keySet())
					{
						List<Student> clas=school.get(v);
						//if(v==1)   //Display students by Class
						System.out.println("Students of Class------------------------------ "+v);
						for(int i=0;i<clas.size();i++)
						{
							Student student=clas.get(i);
							//if(student.name=="Nabee")  //Display students by Name
							//{
							System.out.println("name= "+student.name);
							System.out.println("roll no= "+student.rollno);
							System.out.println("marks= "+student.marks);
							System.out.println();
							// }

						}

					}
				}  
			}

		}
	}
}




