@Library('releng-pipeline') _

hugo (
  appName: 'jee-specs',
  productionBranchName: 'master',
  build: [
    containerImage: 'eclipsefdn/hugo-node:h0.144.2-n22.14.0',
    containerBuildMemoryLimits: '4Gi',
    script: 'build.sh'
  ],
  deployment: [
    nginxServerConf: 'nginx/default.conf'
  ]
)
