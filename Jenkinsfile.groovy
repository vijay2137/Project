pipeline{
    agent jenkins{
        stage{
            step scm {
                sh echo "Executing Build Step"
            }
        }
    }
}
