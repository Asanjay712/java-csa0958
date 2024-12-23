import java.util.ArrayList;
class Generic<T1,T2>{
  private T1 t1;
  private T2 t2;
 public Generic(T1 t1,T2 t2){
    this.t1=t1;
    this.t2=t2;

  }
  void setvalue(T1 t1){
    this.t1=t1;
  }
  public T1 getvalue(){
    return t1;
    
  }
    void setvalue1(T2 t2){
    this.t2=t2;
  }
  public T2 getvalue1(){
    return t2;
    
  }

  public static void main(String[] args){
// Scanner scanner=new Sacnner(System.in);
 
  Generic<Integer,String> obj=new Generic<>(20,"san");
 // obj.setvalue(20);
  System.out.println(obj.getvalue());
 // obj.setvalue1("san");
  System.out.println(obj.getvalue1());
     
  }
}
