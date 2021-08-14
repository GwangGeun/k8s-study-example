# k8s 학습 목적 repo

### 테스트 
1. ./kubernates/basic 첫 배포 테스트할 경우
   
- kubectl apply -f deployment.yaml
- kubectl apply -f service.yaml
- kubectl apply -f ingress.yaml
- kubectl apply -f top.yaml ( top.yaml 은 필요시에만 )

2. ./kubernates/basic 코드 변경 할 경우

- 새로운 dockerImage 생성
- deployment.yaml 에 해당 image 내용 update
- kubectl replace -f deployment.yaml


### CI/CD 관련

1. blue/green 및 canary 배포를 위해서는 argoCD 같은 것을 별도로 사용해야 함
2. argoCD 의 경우 gitOps 철학을 바탕으로 설계되어있음

### 기타

1. k9s (쿠버네티스 관리 툴) 사용 중 ex) brew install k9s 
