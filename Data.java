class Data {
  private String name;
  private String brand;
  private int num;

  public Data() {
	  name = "unnamed";
	  brand = "no brand";
	  num = 0;
  }
  public Data(String iname, String ibrand, int inum) {
	  name = iname;
	  brand = ibrand;
	  num = inum;
	  System.out.printf("New entry added: %s %s %d \n",brand, name, num);
  }
  public void print(){
	  System.out.printf("%dx %s %s \n",num,brand, name);
  }
}