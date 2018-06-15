import hudson.EnvVars
import hudson.model.Environment

def build = Thread.currentThread().executable
def vars = [CUSTOM1: 'value1', custom2: 'value2']
println "hi"
build.environments.add(0, Environment.create(new EnvVars(vars)))
