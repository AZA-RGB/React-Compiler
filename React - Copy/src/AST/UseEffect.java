package AST;

public class UseEffect extends  ASTNode{
    DependencyArray dependencyArray; //.listofIdetifiers

    ArrowFunction callBackFunction;

    public UseEffect(DependencyArray dependencyArray, ArrowFunction callBackFunction) {
        this.dependencyArray = dependencyArray;
        this.callBackFunction = callBackFunction;
    }

    @Override
    public String toString() {
        if(dependencyArray!=null){
            return "UseEffect{\n\t" +
                    dependencyArray +
                    ",\n\t callBackFunction: " + callBackFunction +
                    '}';
        }
        return "UseEffect{\n\t" +
                "callBackFunction: " + callBackFunction +
                '}';

    }

	public String toJS() {

//        ////useEffect() code template
//        prevDep = [];
//
//        //prevDep["prevcount"] = count;
//
//        callback1 = () => {
//            console.log("callback1");
//        };
//
//        addEffect({ callBack: callback1, dependecyArray:prevDep });
//        //addEffect({ callBack: callback1 });
//TODO get the component name from the parent ASTNode component->named||arrow->statement
        String componentName="App";
        Integer randomNum = (int)(Math.random() * 101);

        StringBuilder useEffectCode=new StringBuilder();
        StringBuilder callBackName=new StringBuilder();
        StringBuilder callBackFunctionCode=new StringBuilder();
        String dependencyArrayName= "Dep"+componentName+randomNum;

        callBackName.append("callBack").append(componentName).append(randomNum);
        callBackFunctionCode.append(callBackName).append(" = ").append(callBackFunction.toJS());

        if(dependencyArray!=null){
            useEffectCode.append(dependencyArray.ToJS(dependencyArrayName));
            useEffectCode.append(callBackFunctionCode);
            useEffectCode.append("addEffect({ callBack: ").append(callBackName).append(", dependecyArray:").append(dependencyArrayName).append(" })");

        }else {
            useEffectCode.append(callBackFunctionCode).append("\n");
            useEffectCode.append("addEffect({ callBack: ").append(callBackName).append("})");
        }


        return useEffectCode.toString();
	}
}