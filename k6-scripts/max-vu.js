import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
    stages: [
        { duration: '3m30s', target: 200 },
        { duration: '1m', target: 200 },
        { duration: '30s', target: 0 },
    ],
};

export default function() {
    let res = http.get('http://localhost:8088/say?greeting=you');
    check(res, {
        'status was 200': r => r.status == 200
    });
    sleep(0.05)
}
