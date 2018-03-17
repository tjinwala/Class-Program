package com.app.core

case class Student(id:Int,name:String,email:String,var quizzes : List[Int]=List() ,
   var assignment : List[Int]=List(),var tests : List[Int]=List()) {
  private var gpa:Double=0

  
  
  override def toString=s"id :$id name :$name,email: $email Quizzes: $quizzes ,Assignment : $assignment ,Tests : $tests, GPA: $gpa"
  
  def addQuizscore(qscore:Int)=this.quizzes=this.quizzes :+ qscore
  
  def addAssgnscore(Ascore:Int)=this.assignment=this.assignment :+ Ascore
  
  def addtestscore(Ascore:Int)=this.tests=this.tests :+ Ascore
  
  def Computegpa(st:Student)={ 
    this.gpa=(quizzes.sum/quizzes.length)*0.3+(tests.sum/tests.length)*0.5+(assignment.sum/assignment.length)*0.2
  }
  
  
}