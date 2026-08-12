class equalsMethod_Object {
    public static void main(String[] args){
        stuudeent s1 = new stuudeent(1, "PradeepH");
        stuudeent s2 = new stuudeent(1, "PradeepH");
        stuudeent s3 = new stuudeent(3, "PradeepH");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
class stuudeent{
    int id;
    String name;
    stuudeent(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        
        if(this == obj)
            return true;

        if(obj == null || this.getClass() != obj.getClass())
            return false;
        
        stuudeent other = (stuudeent) obj;
        return this.id == other.id && this.name.equals(other.name);
    }
}