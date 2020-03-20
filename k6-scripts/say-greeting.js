import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
    stages: [
        { duration: '2m30s', target: 300 },
        { duration: '1m30s', target: 300 },
        { duration: '60s', target: 0 },
    ],
};

export default function() {
    let res = http.get('http://localhost:8081/say?greeting=you');
    check(res, {
        'status was 200': r => r.status == 200
    });
    sleep(0.1)
}
