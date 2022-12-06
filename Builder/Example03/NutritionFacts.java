package Example03;
//Effective Java의 Builder Pattern
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //Required parameters(필수 인자)
        private final int servingSize;
        private final int servings;

        //Optional parameters - initiallized to default values (선택적 인자는 기본값으로 초기화)
        private int calories        = 0;
        private int fat             = 0;
        private int sodium          = 0;
        private int carbohydrate    = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize    = servingSize;
            this.servings       = servings;
        }

        public Builder calories(int val){
            this.calories = val;
            return this;        //이렇게 하면 .으로 체인을 이어갈 수 있다.
        }

        public Builder fat(int val){
            this.fat = val;
            return this;
        }

        public Builder sodium(int val){
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val){
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder){
        this.servingSize    = builder.servingSize;
        this.servings       = builder.servings;
        this.calories       = builder.calories;
        this.fat            = builder.fat;
        this.sodium         = builder.sodium;
        this.carbohydrate   = builder.carbohydrate;
    }
}
