import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
    vus: 100,
    duration: '60s',
};

export default function() {
    let res = http.get('http://localhost:8088/say?greeting=you');
    check(res, {
        'status was 200': r => r.status == 200
    });
}
