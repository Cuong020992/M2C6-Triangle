public class Shape {//lớp cha
    String color;//thuộc tính
    int a = 400;

    public Shape() {// hàm khởi tạo không tham số
    }

    public Shape(String color) {//hàm khởi tạo có tham số
        this.color = color;
    }

    public String getColor() {//get
        return color;
    }

    public void setColor(String color) {//set
        this.color = color;
    }


}
