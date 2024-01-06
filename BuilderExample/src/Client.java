

public class Client {
    public static void main(String[] args){
//        ModelTrainer trainer = new ModelTrainer("Yolov5",
//                "TrainDataloader", "TestDataloader",
//                "SGD", "MSE",
//                0.001, 64, 256);
        ModelTrainerBuilder builder = new ModelTrainerBuilder();
        builder.model("Yolov5")
                .trainDataloader("TrainDataloader")
                .testDataloader("TestDataloader")
                .optimizer("SGD")
                .lossFunction("MSE")
                .learningRate(0.001)
                .batchSize(64)
                .inputSize(256);
        ModelTrainer trainer = builder.build();
        trainer.info();
    }
}