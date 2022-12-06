package Example03;

public class Main {
    public static void main(String[] args){

        //1번 방법
        NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
        builder.calories(100);
        builder.sodium(35);
        builder.carbohydrate(27);
        NutritionFacts cocaColas = builder.build();


        //2번 방법
        //각 줄마다 builder를 타이핑하지 않아도 되어 편리하다.
        NutritionFacts cocaCola = new NutritionFacts
                                        .Builder(240, 8)    //필수값 입력
                                        .calories(100)
                                        .sodium(35)
                                        .carbohydrate(27)
                                        .build();       //build()가 객체를 생성해 돌려준다.

        
    }
}
