package CreationalPattern.BuilderPatter;

/**
 * @author Edmond Kacaj
 * @date 10/11/2019
 * @YEAR 2019
 * @Project Name DessignPattern
 * <p>
 * We need to get a phone specification which have some params like
 * Type,Version,Display,Color,Memory,price
 * <p>
 * so we need required only type and Version others are optional
 */
public class PhoneSpecification {
    private final String type;
    private final String version;
    private final String display;
    private final String color;
    private final String memory;
    private final String price;

    public PhoneSpecification(BuilderPhone builderPhone) {
        this.type = builderPhone.type;
        this.version = builderPhone.version;
        this.display = builderPhone.display;
        this.color = builderPhone.color;
        this.memory = builderPhone.memory;
        this.price = builderPhone.price;
    }

    @Override public String toString() {
        return "PhoneSpecification{" + "type='" + type + '\'' + ", version='" + version + '\''
            + ", display='" + display + '\'' + ", color='" + color + '\'' + ", memory='" + memory
            + '\'' + ", price='" + price + '\'' + '}';
    }


    // lets create a builder for this class
    public static class BuilderPhone {
        private String type;
        private String version;
        private String display;
        private String color;
        private String memory;
        private String price;

        // so we create a constructor with params we want to be required
        public BuilderPhone(String type, String version) {
            this.type = type;
            this.version = version;
        }

        /**
         * Create the optional Params
         */

        public BuilderPhone display(String display) {
            this.display = display;
            return this;
        }

        public BuilderPhone color(String color) {
            this.color = color;
            return this;
        }

        public BuilderPhone memory(String memory) {
            this.memory = memory;
            return this;
        }

        public BuilderPhone price(String price) {
            this.price = price;
            return this;
        }


        public PhoneSpecification build() {
            return new PhoneSpecification(this);
        }
    }
}
