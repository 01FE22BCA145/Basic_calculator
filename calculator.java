/**
 * The calculator class in Java performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
class calculator{
    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return the sum of the two operands.
     */
    float addition (float operand_1,float operand_2){
        return(operand_1+operand_2);

    }
    /**
     * The function "subtraction" takes two float operands and returns their difference.
     * 
     * @param operand_1 The first operand for subtraction. It is a float data type.
     * @param operand_2 The second operand in the subtraction operation.
     * @return the result of subtracting operand_2 from operand_1.
     */
    float subtraction (float operand_1,float operand_2){
        return(operand_1-operand_2);
}
/**
 * The function "multiplication" takes two float operands and returns their product.
 * 
 * @param operand_1 The first operand of the multiplication operation, which is a floating-point
 * number.
 * @param operand_2 The second operand in the multiplication operation.
 * @return The product of operand_1 and operand_2 is being returned.
 */
float multiplication (float operand_1,float operand_2){
    return(operand_1*operand_2);

}
/**
 * The division function takes two float operands and returns their quotient.
 * 
 * @param operand_1 The first operand of the division operation. It can be any floating-point number.
 * @param operand_2 The second operand in the division operation.
 * @return The division of operand_1 by operand_2.
 */
float division(float operand_1,float operand_2){
    return(operand_1/operand_2);

}
float square(float operand_1){
    return operand_1*operand_1;
}
    


// The code you provided is the main method in Java. The main method is the entry point of a Java
// program and is where the program starts executing.
public static void main(String[] args){
    calculator c=new calculator();
    float operand_1=10;
    float operand_2=5;
    float add_res=c.addition(operand_1, operand_2);
    System.out.println("result"+add_res);
    float sub_res=c.subtraction(operand_1, operand_2);
    System.out.println("result"+sub_res);
    float multi_res=c.multiplication(operand_1, operand_2);
    System.out.println("result"+multi_res);
    float div_res=c.division(operand_1, operand_2);
    System.out.println("result"+div_res);
    float squ_res=c.square(operand_1);
    System.out.println("square" +squ_res);


}
}   