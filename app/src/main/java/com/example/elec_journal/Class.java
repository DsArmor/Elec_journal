package com.example.elec_journal;

public class Class {
    public String Number;
    public Teacher ClassTeacher;
    public Learner[] Learners={};
    public String getList(){
        String learners_list= "";
        for (Learner learner : Learners) {
            learners_list=learners_list+learner.FullName+"\n\t\t";
        }
        return learners_list;
    }
    public void getListParents(){}
}
