package DesignPatterns.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        UserExam userExam;

        try {
//            instead of keeping the setters void use method chaining
//            UserExam.UserExamBuilder userExamBuilder = UserExam.getUserExamBuilder();
//            userExamBuilder.setName("Prajjwal");
//            userExamBuilder.setEnglishMarks(80);
//            userExamBuilder.setMathMarks(90);
//            userExamBuilder.setEnglishMarks(78);
//            userExamBuilder.setScienceMarks(89);
//
//            userExam = userExamBuilder.build();

            userExam = UserExam.getUserExamBuilder()
                                .setName("Prajjwal")
                                .setEnglishMarks(90)
                                .setScienceMarks(92)
                                .setMathMarks(89)
                                .build();

        } catch (Exception exception) {
            System.out.println("Some parameters are wrong");
        }
    }
}
