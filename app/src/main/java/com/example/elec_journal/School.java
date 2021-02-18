package com.example.elec_journal;

import java.util.Arrays;

public class School {
    public static Employee[] employees = {};
    public static Teacher[] teachers = {};
    public static Learner[] learners ={};
    public static String Address;
    public static String Name = "Lyceum 4";
    public static Class[] classes = {};
    public static Elective[] electives = {};
    public static Section[] sections = {};

    public static String getListClasses(int i){
        return "\n\t" +"Class Teacher: "+classes[i].ClassTeacher.FullName+"\n\t" +"Learners: \n\t\t"+classes[i].getList();
    }
    //TODO add num_classes function to unite all numbers in massive
    public static String[] getNumClasses(){
        String[] NumClasses={};
        for(int i=0; i<classes.length; i++){
            NumClasses= Arrays.copyOf(NumClasses,NumClasses.length+1);
            NumClasses[i]=classes[i].Number;
        }
        return NumClasses;
    }
    public static void getListEmployee(){}
    public static void getListLearners(){}
    public static void getElectronicJournal(){}
    public static void getParticipant(Participant participant){}
}
