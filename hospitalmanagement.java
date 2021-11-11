import java.io.*;
import java.util.*;
import java.util.Calendar;

class doctor {
    String doc_id, doc_name, doc_spec, appoint, doc_qual;
    int doc_room;

    public void new_doctor() {
        Scanner input = new Scanner(System.in);

        System.out.print("ID:-");
        doc_id = input.nextLine();
        System.out.print("Name:-");
        doc_name = input.nextLine();
        System.out.print("Qualification:-");
        doc_qual = input.nextLine();
        System.out.println("Specilization:-");
        System.out.println("Enter your choice");
        System.out.println("1:Cardiologist");
        System.out.println("2:Audiologist");
        System.out.println("3:Dentist");
        System.out.println("4:ENT");
        System.out.println("5:Gynaecologist");
        System.out.println("6:Paediatrician");
        System.out.println("7:Psychiatrist");
        System.out.println("8:Oncologist");
        int ch = input.nextInt();
        switch (ch) {
        case 1:
            doc_spec = "Cardiologist";
            break;
        case 2:
            doc_spec = "Audiologist";
            break;
        case 3:
            doc_spec = "Dentist";
            break;
        case 4:
            doc_spec = "ENT";
            break;
        case 5:
            doc_spec = "Gynaecologist";
            break;
        case 6:
            doc_spec = "Paediatrician";
            break;
        case 7:
            doc_spec = "Psychiatrist";
            break;
        case 8:
            doc_spec = "Oncologist";
            break;
        default:
            System.out.println("Wrong choice!!");
        }

        System.out.println("Work time:-");
        System.out.println("Enter choice: ");
        System.out.println("1:1-2pm");
        System.out.println("2:2-3pm");
        System.out.println("3:3-4pm");
        System.out.println("4:4-5pm");
        System.out.println("5:5-6pm");
        System.out.println("6:6-7pm");
        int ch1 = input.nextInt();
        switch (ch1) {
        case 1:
            appoint = "1-2pm";
            break;
        case 2:
            appoint = "2-3pm";
            break;
        case 3:
            appoint = "3-4pm";
            break;
        case 4:
            appoint = "4-5pm";
            break;
        case 5:
            appoint = "5-6pm";
            break;
        default:
            System.out.println("Wrong choice!!");
        }

        System.out.println("Room number:-");
        doc_room = input.nextInt();

    }

    public void doctor_info() {
        System.out.println(doc_id + "\t" + doc_name + "  \t" + doc_spec + "     \t" + appoint + "    \t" + doc_qual
                + "       \t" + doc_room);
    }
}

class search_doctor {
    doctor d = new doctor();

    public void search(doctor d[]) {
        Scanner input = new Scanner(System.in);

        hospitalmanp_agement hm = new hospitalmanp_agement();
        System.out.println("Enter the doc_spec type you want to search for: ");
        System.out.println("Specilization:-");
        System.out.println("1:Cardiologist");
        System.out.println("2:Audiologist");
        System.out.println("3:Dentist");
        System.out.println("4:ENT");
        System.out.println("5:Gynaecologist");
        System.out.println("6:Paediatrician");
        System.out.println("7:Psychiatrist");
        System.out.println("8:Oncologist");
        int ch1 = input.nextInt();
        String str = "";
        switch (ch1) {
        case 1:
            str = "Cardiologist";
            break;
        case 2:
            str = "Audiologist";
            break;
        case 3:
            str = "Dentist";
            break;
        case 4:
            str = "ENT";
            break;
        case 5:
            str = "Gynaecologist";
            break;
        case 6:
            str = "Paediatrician";
            break;
        case 7:
            str = "Psychiatrist";
            break;
        case 8:
            str = "Oncologist";
            break;
        default:
            System.out.println("wrong choice");

        }

        for (int j = 0; j < 25; j++) {
            if (str.equals(d[j].doc_spec)) {
                System.out.println("id \t Name\t doc_spec \t Timing \t Qualification \t Room No.");
                d[j].doctor_info();
            }
        }

    }
}

class patient {
    String p_id, p_name, p_disease, p_gender, p_admit;
    int p_age;

    void new_patient() {
        Scanner input = new Scanner(System.in);
        System.out.print("ID:-");
        p_id = input.nextLine();
        System.out.print("Name:-");
        p_name = input.nextLine();
        System.out.print("p_disease:-");
        p_disease = input.nextLine();
        System.out.print("p_gender:-");
        p_gender = input.nextLine();
        System.out.print("p_admit:-");
        p_admit = input.nextLine();
        System.out.print("p_age:-");
        p_age = input.nextInt();
    }

    void patient_info() {
        System.out.println(
                p_id + "\t" + p_name + " \t" + p_disease + "     \t" + p_gender + "      \t" + p_admit + "\t" + p_age);
    }
}

class medicine {

    String med_name, med_comp, med_expiry;
    int med_cost, count, med_id;

    void new_medicine() {
        Scanner input = new Scanner(System.in);
        System.out.print("Name:-");
        med_name = input.nextLine();
        System.out.print("Company:-");
        med_comp = input.nextLine();
        System.out.print("Expiry date in dd/mm/yyyy format :-");
        med_expiry = input.nextLine();
        System.out.print("Enter id: ");
        med_id = input.nextInt();
        System.out.print("Cost:-");
        med_cost = input.nextInt();
        System.out.println("Number of unit:-");
        count = input.nextInt();
    }

    void print_medi() {
        System.out.println(med_id + " \t" + med_name + "  \t" + med_comp + "    \t" + med_expiry + "     \t" + med_cost);
    }

    void delete_medicine(int ch, medicine m[]) {
        for (int i = ch - 1; i < m.length - 1; i++) {
            m[i] = m[i + 1];
        }
    }
}

class hospital_room {
    int icuroom = 5;
    int groom = 21;

    public void icurooms() {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of icu rooms occupied are :" + icuroom);
        System.out.println("The number of icu rooms available are :" + (40 - icuroom));
        System.out.println("1: Mark room as occupied 2: Room emptied 3: Exit");
        int room_ch = input.nextInt();
        switch (room_ch) {
        case 1:
            icuroom++;
            break;
        case 2:
            icuroom--;
            break;
        case 3:
            break;
        default:
            System.out.println("wrong choice!!");
        }
        System.out.println("The number of icu rooms occupied are :" + icuroom);
        System.out.println("The number of icu rooms available are :" + (40 - icuroom));
    }

    void grooms() {
        Scanner input = new Scanner(System.in);

        System.out.println("The number of gen rooms occupied are :" + groom);
        System.out.println("The number of gen rooms available are :" + (40 - groom));
        System.out.println("1: Mark room as occupied 2: Room emptied 3: Exit");
        int room_ch = input.nextInt();
        switch (room_ch) {
        case 1:
            groom++;
            break;
        case 2:
            groom--;
            break;
        case 3:
            break;
        default:
            System.out.println("wrong choice");
        }
        System.out.println("The number of gen rooms occupied are :" + groom);
        System.out.println("The number of gen rooms available are :" + (40 - groom));
    }
}

public class hospitalmanp_agement {
    int count1, count2, count3, count4, count5, count6;

    public static void main(String args[]) {

        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        Calendar calendar = Calendar.getInstance();
        // System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            * Welcome to Hospital Manp_agement System Project in Java *");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " "
                + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
                + ":" + calendar.get(Calendar.SECOND));
        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        medicine[] m = new medicine[100];
        hospital_room hr = new hospital_room();
        search_doctor sd = new search_doctor();
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();

        for (i = 0; i < 100; i++)
            m[i] = new medicine();

        d[0].doc_id = "21";
        d[0].doc_name = "Dr.Ghanendra";
        d[0].doc_spec = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].doc_room = 17;
        d[1].doc_id = "32";
        d[1].doc_name = "Dr.Vikram";
        d[1].doc_spec = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].doc_room = 45;
        d[2].doc_id = "17";
        d[2].doc_name = "Dr.Rekha";
        d[2].doc_spec = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].doc_room = 8;
        d[3].doc_id = "33";
        d[3].doc_name = "Dr.Pramod";
        d[3].doc_spec = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].doc_room = 40;

        p[0].p_id = "12";
        p[0].p_name = "Pankaj";
        p[0].p_disease = "Cancer";
        p[0].p_gender = "Male";
        p[0].p_admit = "y";
        p[0].p_age = 30;
        p[1].p_id = "13";
        p[1].p_name = "Sumit";
        p[1].p_disease = "Cold";
        p[1].p_gender = "Male";
        p[1].p_admit = "y";
        p[1].p_age = 23;
        p[2].p_id = "14";
        p[2].p_name = "Alok";
        p[2].p_disease = "Maleriya";
        p[2].p_gender = "Male";
        p[2].p_admit = "y";
        p[2].p_age = 45;
        p[3].p_id = "15";
        p[3].p_name = "Ravi";
        p[3].p_disease = "Diabetes";
        p[3].p_gender = "Male";
        p[3].p_admit = "y";
        p[3].p_age = 25;

        m[0].med_id = 1;
        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].med_expiry = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_id = 2;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].med_expiry = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_id = 3;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].med_expiry = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_id = 4;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].med_expiry = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1) {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1: Doctor  2: Patients  3: Medicines 4: Rooms 5: Search doctors");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice) {
            case 1: {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                      *DOCTOR SECTION*");
                System.out.println("--------------------------------------------------------------------------------");
                s1 = 1;
                while (s1 == 1) {
                    System.out.println("1: Add New Entry\n2: Existing Doctors List\n3: View medicines available ");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        d[count1].new_doctor();
                        ++count1;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name\t doc_spec \t Timing \t Qualification \t Room No.");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count1; j++) {
                            d[j].doctor_info();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Company \t Expiry Date \t Cost");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
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
            case 2: {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                     *PATIENT SECTION*");
                System.out.println("--------------------------------------------------------------------------------");
                s2 = 1;
                while (s2 == 1) {
                    System.out.println(
                            "1: Add New Entry\n2: Existing Patients List\n3: Room Status\n4: Existing doctors list");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        p[count2].new_patient();
                        count2++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("Id \t Name \t p_disease \t Gender  Admit Status \t p_age");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count2; j++) {
                            p[j].patient_info();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("View the status of :");
                        System.out.println("1: General category rooms 2: ICU rooms");
                        int ch = input.nextInt();
                        switch (ch) {
                        case 1: {
                            System.out.println("The number of gen rooms occupied are :" + hr.groom);
                            System.out.println("The number of gen rooms available are :" + (40 - hr.groom));
                            break;
                        }
                        case 2: {
                            System.out.println("The number of ICU rooms occupied are :" + hr.icuroom);
                            System.out.println("The number of ICU rooms available are :" + (40 - hr.icuroom));
                            break;

                        }

                        }
                        break;
                    }
                    case 4: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println(
                                "id \t\t\t\t\t Name\t\t\t\t\t doc_spec \t\t\t\t\t Timing \t\t\t\t\t Qualification \t\t\t\t\t Room No.");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count1; j++) {
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
            case 3: {
                s3 = 1;
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                     *MEDICINE SECTION*");
                System.out.println("--------------------------------------------------------------------------------");
                while (s3 == 1) {
                    System.out.println("1. Add New Entry\n2. Existing Medicines List\n3. Delete a medicine");
                    c1 = input.nextInt();
                    switch (c1) {
                    case 1: {
                        m[count3].new_medicine();
                        count3++;
                        break;
                    }
                    case 2: {
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Company \t Expiry Date \t Cost");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count3; j++) {
                            m[j].print_medi();
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the medicine you want to delete: ");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        System.out.println("id \t Name \t Company \t Expiry Date \t Cost");
                        System.out.println(
                                "--------------------------------------------------------------------------------");
                        for (j = 0; j < count3; j++) {
                            m[j].print_medi();

                        }
                        int chm = input.nextInt();
                        m[count3].delete_medicine(chm, m);
                        count3--;
                    }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = input.nextInt();
                }
                break;
            }
            case 4: {
                System.out.println("1: ICU room 2: General category room");
                c1 = input.nextInt();
                switch (c1) {
                case 1:
                    hr.icurooms();
                    break;
                case 2:
                    hr.grooms();
                    break;
                }

                break;
            }
            case 5: {
                sd.search(d);
                break;
            }

            default: {
                System.out.println(" You Have Entered Wrong Choice!!!");
            }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}
