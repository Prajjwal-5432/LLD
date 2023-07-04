package DesignPatterns.BuilderDesignPattern;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String Name;
    private UserExam() {}

    public static UserExamBuilder getUserExamBuilder() {
        return new UserExamBuilder();
    }
    public static class UserExamBuilder {
        private int englishMarks;
        private int mathMarks;
        private int scienceMarks;
        private String Name;

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            Name = name;
            return this;
        }

        public UserExam build() {
            //Step1: validate the attributes
            if(englishMarks > 100 || mathMarks > 100 || scienceMarks > 100) {
                throw new InvalidParameterException("Marks cannot be greater than 100");
            }

            //Step2: create the parent
            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathMarks = this.mathMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.Name = this.Name;

            return userExam;
        }
    }
}
