public class ModelTrainerBuilder {
    private ModelTrainer modelTrainer;

    public ModelTrainerBuilder(){
        this.modelTrainer = new ModelTrainer();
    }

    public ModelTrainerBuilder model(String modelName){
        this.modelTrainer.setModel(modelName);
        return this;
    }

    public ModelTrainerBuilder trainDataloader(String trainDataloader){
        this.modelTrainer.setTrainDataloader(trainDataloader);
        return this;
    }

    public ModelTrainerBuilder validDataloader(String validDataloader){
        this.modelTrainer.setValidDataloader(validDataloader);
        return this;
    }

    public ModelTrainerBuilder testDataloader(String testDataloader){
        this.modelTrainer.setTestDataloader(testDataloader);
        return this;
    }

    public ModelTrainerBuilder optimizer(String optimizer){
        this.modelTrainer.setOptimizer(optimizer);
        return this;
    }

    public ModelTrainerBuilder lossFunction(String lossFunction){
        this.modelTrainer.setLossFunction(lossFunction);
        return this;
    }

    public ModelTrainerBuilder learningRate(double learningRate){
        this.modelTrainer.setLearningRate(learningRate);
        return this;
    }

    public ModelTrainerBuilder batchSize(int batchSize){
        this.modelTrainer.setBatchSize(batchSize);
        return this;
    }

    public ModelTrainerBuilder inputSize(int inputSize){
        this.modelTrainer.setInputSize(inputSize);
        return this;
    }

    public ModelTrainerBuilder preProcessor(String preProcessor){
        this.modelTrainer.setPreProcessor(preProcessor);
        return this;
    }

    public ModelTrainerBuilder postProcessor(String postProcessor){
        this.modelTrainer.setPostProcessor(postProcessor);
        return this;
    }

    public ModelTrainerBuilder visualizer(String visualizer){
        this.modelTrainer.setVisualizer(visualizer);
        return this;
    }

    public ModelTrainer build(){
        return modelTrainer;
    }
}
