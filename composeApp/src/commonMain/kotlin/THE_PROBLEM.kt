// The problem occur when we use the word "Context" as a class name "in composeApp module".
// Try to name this class to "MContext" or anything else and ios app will launch just fine.
class Context

// Yes, this problem only occur in composeApp module.
// In case of multi module project, having a class named "Context" won't be a problem.