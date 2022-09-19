def call() {
    params = [
        string(
            defaultValue: '',
            description: 'Version to deploy',
            name: 'VERSION'
        ),
    ]
    properties([
        parameters(
            params
        )
    ])
}