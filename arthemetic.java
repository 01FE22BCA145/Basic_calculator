/**
 * The "arthemetic" class contains methods for calculating the square, cube, and modulus of two
 * numbers.
 */
class  arthemetic {
    /**
     * The function "square" takes an integer as input and returns the square of that integer.
     * 
     * @param operand_1 An integer value that represents the operand to be squared.
     * @return the square of the operand_1.
     */
    float  square(float operand_1){
        return (operand_1*operand_1);
    }
    /**
     * The function "cube" takes an integer as input and returns the cube of that integer.
     * 
     * @param operand_1 The parameter "operand_1" is an integer value that represents the number for
     * which we want to calculate the cube.
     * @return The cube of the operand_1 value.
     */
    float  cube(float  operand_1){
        return (operand_1*operand_1*operand_1);
    }
    /**
     * The function calculates the modulus of two floating-point numbers.
     * 
     * @param operand_1 The first operand for the modulus operation.
     * @param operand_2 The second operand in the modulus operation.
     * @return the remainder of dividing operand_1 by operand_2.
     */
    float  modulas(  float  operand_1,float  operand_2){
        return (operand_1% operand_2);
    }
    
}
