// The problem occur when we use the word "Context" as a class name "in composeApp module".
// Try to name this class to "MContext" or anything else and ios app will launch just fine.
class Context

// Yes, this problem only occur in composeApp module.
// In the case of multimodule project, having a class named in another module "Context" won't be a problem.
// But maybe it will if the composeAppModule is importing the suspected class.