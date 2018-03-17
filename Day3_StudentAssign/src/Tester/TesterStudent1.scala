package Tester
import com.app.core.Student
import java.util.Scanner
object TesterStudent extends App{
  
 val sc=new Scanner(System.in)
 var exit=false
 var flag=false

 while(!exit)
 {
   println("Enter Student id,Name,Email")
  val st=new Student(sc.nextInt(),sc.next(),sc.next())  
 while(!flag)
 {
   println("Enter Score under 1.Quiz,2.test,3.Assignment 4.Exit") 
 val a=sc.nextInt() match {
    case 1 =>st.addQuizscore(sc.nextInt())
    case 2 => st.addtestscore(sc.nextInt())
    case 3 => st.addAssgnscore(sc.nextInt())
    case i => flag=true
 
  }
 }
   st.Computegpa(st)
  println("=======Student Details::======")
  println(st) 
println("===============")   
println("Do you want to Continue ")
if(sc.next()!="yes")
{
  exit=true
}
 }
}