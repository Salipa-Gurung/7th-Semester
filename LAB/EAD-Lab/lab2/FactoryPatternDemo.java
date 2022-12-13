interface Shape{
    void createDiagram();
}

class Rectangle implements Shape{
    public void createDiagram(){
        System.out.println("Rectangle");
    }
}

class Circle implements Shape{
    public void createDiagram(){
        System.out.println("Circle");
    }
}

class ShapeFactory{
    Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }
}

class FactoryPatternDemo{
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.createDiagram();

        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.createDiagram();
    }
}