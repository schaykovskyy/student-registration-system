
public class Driver {
    public static void main(String args[]){
        MRegistration registrationModel = new MRegistration();
        MStudent studentModel = new MStudent(registrationModel);
        MOffering offeringModel = new MOffering();
        MCatalog catalogModel = new MCatalog(offeringModel);
        GUI guiView = new GUI();

        CRegistration registrationController = new CRegistration(guiView, registrationModel);
        CStudent studentController = new CStudent(guiView, studentModel, registrationController);
        registrationController.studentController = studentController;
        COffering offeringController = new COffering(guiView, offeringModel, studentController);
        CCatalog catalogController = new CCatalog(guiView, catalogModel, offeringController);

    }
}
