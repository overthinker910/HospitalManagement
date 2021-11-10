import java.io.*;
import java.util.*;
import java.util.Calendar;


class doctor
{
    String did, dname, specialist, appoint, doc_qual;
    int droom;
    public void new_doctor()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.println("specilization:-");
        System.out.println("Enter choice");
        System.out.println("1:Cardiologist");
        System.out.println("2:Audiologist");
        System.out.println("3:Dentist");
        System.out.println("4:ENT");
        System.out.println("5:Gynaecologist");
        System.out.println("6:Paediatrician");
        System.out.println("7:Psychiatrist");
        System.out.println("8:Oncologist");
        int ch= input.nextInt();
        switch(ch)
        {
            case 1:specialist="Cardiologist";break;
            case 2:specialist="Audiologist";break;
            case 3:specialist="Dentist";break;
            case 4:specialist="ENT";break;
            case 5:specialist="Gynaecologist";break;
            case 6:specialist="Paediatrician";break;
            case 7:specialist="Psychiatrist";break;
            case 8:specialist="Oncologist";break;
            default:System.out.println("Wrong choice");
        }

        System.out.println("work time:-");
        System.out.println("Enter choice");
        System.out.println("1:1-2pm");
        System.out.println("2:2-3pm");
        System.out.println("3:3-4pm");
        System.out.println("4:4-5pm");
        System.out.println("5:5-6pm");
        System.out.println("6:6-7pm");
        int ch1 = input.nextInt();
        switch(ch1)
        {
            case 1:appoint="1-2pm";break;
            case 2:appoint="2-3pm";break;
            case 3:appoint="3-4pm";break;
            case 4:appoint="4-5pm";break;
            case 5:appoint="5-6pm";break;
            default:System.out.println("Wrong choice");
        }
        
        System.out.println("room no.:-");
        droom = input.nextInt();
        
    }
    public void doctor_info()
    {
        System.out.println(did + "\t" + dname + "  \t" + specialist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);
    }
}
class search_doctor 
{
    public void search()
    {
        Scanner input= new Scanner(System.in);
        doctor d=new doctor(); 
        hospitalmanagement hm=new hospitalmanagement();
        System.out.println("enter the specialist type you want to search for ");
        System.out.println("specilization:-");
        System.out.println("1:Cardiologist");
        System.out.println("2:Audiologist");
        System.out.println("3: Dentist");
        System.out.println("4:ENT");
        System.out.println("5:Gynaecologist");
        System.out.println("6:Paediatrician");
        System.out.println("7:Psychiatrist");
        System.out.println("8:Oncologist");
        String ch1=input.nextLine();
        // for (int j = 0; j < hm.count1; j++)
        // {
        // if(ch1.equals(d[j].specialist))
        //     d[j].doctor_info();
        // }
        
   }   }
class patient
{
    String pid, pname, disease, sex, admit_status;
    int age;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
    }
    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
}
class medicine extends hospitalmanagement
{
   public medicine(){
        medicine[] m = new medicine[100];
    }
    String med_name, med_comp, exp_date;
    int med_cost, count,med_id;
    void new_medicine()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        med_name = input.nextLine();
        System.out.print("company:-");
        med_comp = input.nextLine();
        System.out.print("expiry date in dd/mm/yyyy format :-");
        exp_date = input.nextLine();
        System.out.print("Enter id: ");
        med_id=input.nextInt();
        System.out.print("cost:-");
        med_cost = input.nextInt();
        System.out.println("no of unit:-");
        count = input.nextInt();
    }
    void print_medi()
    {
        System.out.println(med_id+" \t"+ med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }
    void delete_medicine(int ch,medicine m[])
    {
        for(int i=ch-1;i<m.length-1;i++){
             m[i]=m[i+1];
        }
    }
}

class hospital_room
{
    int icu_room=5;
    int gen_room=21;
    public void  icu_rooms()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("the number of icu rooms occupied are :"+icu_room);
        System.out.println("the number of icu rooms available are:"+(40-icu_room));
        System.out.println("1: Mark room as occupied 2: Room emptied 3: Exit");
        int room_ch=input.nextInt();
        switch(room_ch)
        {
            case 1:icu_room++;break;
            case 2:icu_room--;break;
            case 3:break;
            default:System.out.println("wrong choice");
        }
        System.out.println("the number of icu rooms occupied are :"+icu_room);
        System.out.println("the number of icu rooms available are:"+(40-icu_room));
    }
    void gen_rooms()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("the number of gen rooms occupied are :"+gen_room);
        System.out.println("the number of gen rooms available are:"+(40-gen_room));
        System.out.println("1: Mark room as occupied 2: Room emptied 3: Exit");
        int room_ch=input.nextInt();
        switch(room_ch)
        {
            case 1:gen_room++;break;
            case 2:gen_room--;break;
            case 3:break;
            default:System.out.println("wrong choice");
        }
        System.out.println("the number of gen rooms occupied are :"+gen_room);
        System.out.println("the number of gen rooms available are:"+(40-gen_room));
    }
}
 
public class hospitalmanagement 
{
    int count1, count2, count3, count4, count5, count6;
    public static void main(String args[])
    {
      
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
         doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        medicine[] m = new medicine[100];
        hospital_room hr=new hospital_room();
        search_doctor sd=new search_doctor();
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        
        for (i = 0; i < 100; i++)
            m[i] = new medicine();
      

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specialist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specialist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specialist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specialist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;
        
        m[0].med_id =1;
        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_id =2;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_id =3;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_id =4;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

       

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1: Doctor  2: Patients  3: Medicines 4: Rooms 5: Search doctors");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1: Add New Entry\n2: Existing Doctors List\n3: View medicines available ");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].new_doctor();
                                        ++count1;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t specialist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                                case 3:{
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Company \t Expiry Date \t Cost");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count3; j++) {
                                        m[j].print_medi();
                                    }
                                    break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1: Add New Entry\n2: Existing Patients List\n3: Room Status\n4: Existing doctors list");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].new_patient();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t\t Name \t\t\t Disease \t\t\t Gender \t\t\t Admit Status \t\t\t\t\t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }
                                case 3:{
                                    System.out.println("View the status of: ");
                                    System.out.println("1: General category rooms 2: ICU rooms");
                                    int ch=input.nextInt();
                                    switch(ch){
                                    case 1:{
                                        System.out.println("the number of gen rooms occupied are :"+hr.gen_room);
                                        System.out.println("the number of gen rooms available are:"+(40-hr.gen_room));
                                        break;
                                    }
                                    case 2:{
                                    System.out.println("the number of ICU rooms occupied are :"+hr.icu_room);
                                    System.out.println("the number of ICU rooms available are:"+(40-hr.icu_room));break;

                                    }
                                    
                                    }
                                    break;
                                }
                                case 4:{
                                    System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t\t\t\t\t Name\t\t\t\t\t specialist \t\t\t\t\t Timing \t\t\t\t\t Qualification \t\t\t\t\t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1. Add New Entry\n2. Existing Medicines List\n3. Delete a medicine");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m[count3].new_medicine();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            m[j].print_medi();
                                        }
                                        break;
                                    }
                                case 3: 
                                {
                                    System.out.println("Enter the medicine you want to delete: ");
                                    System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Company \t Expiry Date \t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            m[j].print_medi();

                                }
                                int chm=input.nextInt();
                                m[count3].delete_medicine(chm,m);
                                count3--;
                            }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                case 4:
                {System.out.println("1: ICU room 2: General category room");
                          c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:hr.icu_rooms();break;
                                case 2:hr.gen_rooms();break;
                            }
                        
                       break;
                        }
                case 5:{
                    sd.search();
                    break;
                }

                default:
                    {
                        System.out.println(" You Have Entered Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
