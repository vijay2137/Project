pipeline{
    agent jenkins{
        stage{
            step{
                echo "Executing Build Step"
            }
        }
    }
}