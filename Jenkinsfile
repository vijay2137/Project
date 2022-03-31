pipeline{
    agent {
        stages{
            stage('Build'){
                step{
                    echo 'Hello World'
                }
            }
            stage(Development){
                when{
                    branch 'dev'
                }
                step{
                    echo 'This is from Dev Branch'
                }
            }
            stage(Test){
                when{
                    brach 'test'
                }
                step{
                    echo 'This is from Test Brach'
                }
            }
        }

    }
}
